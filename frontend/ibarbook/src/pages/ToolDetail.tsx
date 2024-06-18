import React from 'react';
import { useParams } from 'react-router-dom';
import toolsData from '../data/toolsData';
import './ToolDetail.css';

const ToolDetail: React.FC = () => {
    const { id } = useParams<{ id: string }>();
    const tool = toolsData.find(i => i.id === id);

    if (!tool) {
        return <div>Tool not found</div>;
    }

    return (
        <div className="tool-detail">
            <h2>{tool.name}</h2>
            <img src={tool.image} alt={tool.name} />
            {/* Вы можете добавить больше информации об ингредиенте, если она доступна */}
        </div>
    );
};

export default ToolDetail;