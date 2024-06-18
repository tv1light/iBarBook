import React from 'react';
import { useParams } from 'react-router-dom';
import cocktailsData from '../data/cocktailsData';
import './CocktailDetail.css';

const CocktailDetail: React.FC = () => {
    const { id } = useParams<{ id: string }>();
    const cocktail = cocktailsData.find(c => c.id === id);

    if (!cocktail) {
        return <div>Cocktail not found</div>;
    }

    return (
        <div className="cocktail-detail">
            <h2>{cocktail.name}</h2>
            <img src={cocktail.image} alt={cocktail.name} />
            <h3>Ingredients:</h3>
            <ul>
                {cocktail.ingredients.map((ingredient, index) => (
                    <li key={index}>{ingredient}</li>
                ))}
            </ul>
            <h3>Recipe:</h3>
            <p>{cocktail.recipe}</p>
        </div>
    );
};

export default CocktailDetail;
