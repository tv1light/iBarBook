import React from 'react';
import { Link } from 'react-router-dom';
import ingredientsData from '../data/ingredientsData';
import './Ingredients.css';

const Ingredients: React.FC = () => {
    return (
        <div className="ingredients-container">
        <div className="ingredients">
            {ingredientsData.map(ingredient => (
                    <div key={ingredient.id} className="ingredient">
                <Link to={`/ingredients/${ingredient.id}`}>
            <h2>{ingredient.name}</h2>
            <img src={ingredient.image} alt={ingredient.name} />
    </Link>
    </div>
))}
    </div>
    </div>
);
};

export default Ingredients;
