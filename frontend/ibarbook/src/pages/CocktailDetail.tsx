import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { getCocktailById } from '../services/cocktailService';
import './CocktailDetail.css';

interface Ingredient {
    id: number;
    name: string;
    description: string;
}

interface Cocktail {
    id: number;
    name: string;
    description: string;
    recipe: string;
    ingredients: Ingredient[];
    image: string;
}

const CocktailDetail: React.FC = () => {
    const { id } = useParams<{ id: string }>();
    const [cocktail, setCocktail] = useState<Cocktail | null>(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState<string | null>(null);

    useEffect(() => {
        const fetchCocktail = async () => {
            if (id) {
                try {
                    const cocktailData = await getCocktailById(id);
                    setCocktail(cocktailData);
                } catch (err) {
                    setError('Cocktail not found');
                } finally {
                    setLoading(false);
                }
            } else {
                setError('Invalid cocktail ID');
                setLoading(false);
            }
        };

        fetchCocktail();
    }, [id]);

    if (loading) {
        return <div>Loading...</div>;
    }

    if (error) {
        return <div>{error}</div>;
    }

    if (!cocktail) {
        return <div>Cocktail not found</div>;
    }

    return (
        <div className="cocktail-detail">
            <h2>{cocktail.name}</h2>
            <img src={cocktail.image} alt={cocktail.name} />
            <h3>Ingredients:</h3>
            <ul>
                {cocktail.ingredients.map((ingredient) => (
                    <li key={ingredient.id}>
                        <strong>{ingredient.name}</strong>: {ingredient.description}
                    </li>
                ))}
            </ul>
            <h3>Recipe:</h3>
            <p>{cocktail.recipe}</p>
        </div>
    );
};

export default CocktailDetail;






