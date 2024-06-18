import React from 'react';
import './Cocktail.css'; // Создайте этот файл для стилей компонента

interface CocktailProps {
    name: string;
}

const Cocktail: React.FC<CocktailProps> = ({ name }) => {
    return <div className="cocktail">{name}</div>;
};

export default Cocktail;