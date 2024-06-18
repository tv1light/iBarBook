import React from 'react';
import { Link } from 'react-router-dom';
import cocktailsData from '../data/cocktailsData';
import './Cocktails.css';

const Cocktails: React.FC = () => {
    return (
        <div className="cocktails-container">
            <div className="cocktails">
                {cocktailsData.map(cocktail => (
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
