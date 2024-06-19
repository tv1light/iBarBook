import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import { getCocktails } from '../services/cocktailService';
import './Cocktails.css';

interface Cocktail {
    id: number;
    name: string;
    description: string;
    recipe: string;
    image: string; // Assuming there is an image field
}

const Cocktails: React.FC = () => {
    const [cocktails, setCocktails] = useState<Cocktail[]>([]);

    useEffect(() => {
        const fetchCocktails = async () => {
            const cocktailsData = await getCocktails();
            setCocktails(cocktailsData);
        };

        fetchCocktails();
    }, []);

    return (
        <div className="cocktails-container">
            <div className="cocktails">
                {cocktails.map(cocktail => (
                    <div key={cocktail.id} className="cocktail">
                        <Link to={`/cocktails/${cocktail.id}`}>
                            <h2>{cocktail.name}</h2>
                            <img src={cocktail.image} alt={cocktail.name} />
                        </Link>
                    </div>
                ))}
            </div>
        </div>
    );
};

export default Cocktails;


