// src/components/IngredientDetail.js
import React from 'react';
import { useParams } from 'react-router-dom';
import ingredientsData from '../data/ingredientsData';
import './IngredientDetail.css';

const IngredientDetail: React.FC = () => {
    const { id } = useParams<{ id: string }>();
    const ingredient = ingredientsData.find(i => i.id === id);

    if (!ingredient) {
        return <div>Ingredient not found</div>;
    }

    return (
        <div className="ingredient-detail">
            <h2>{ingredient.name}</h2>
            <img src={ingredient.image} alt={ingredient.name} />
            {/* Вы можете добавить больше информации об ингредиенте, если она доступна */}
        </div>
    );
};

export default IngredientDetail;
