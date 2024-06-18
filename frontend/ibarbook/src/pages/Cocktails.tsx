import React from 'react';
import Cocktail from '../components/Cocktail';

const Cocktails: React.FC = () => {
    const cocktailList = ['Коктейль 1', 'Коктейль 2', 'Коктейль 3'];
    return (
        <div className="content">
            {cocktailList.map((name, index) => (
                <Cocktail key={index} name={name} />
            ))}
        </div>
    );
};

export default Cocktails;
