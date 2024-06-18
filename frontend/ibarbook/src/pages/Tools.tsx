import React from 'react';
import { Link } from 'react-router-dom';
import toolsData from '../data/toolsData';
import './Tools.css';

const Tools: React.FC = () => {
    return (
        <div className="tools-container">
            <div className="tools">
                {toolsData.map(tool => (
                    <div key={tool.id} className="tool">
                        <Link to={`/tools/${tool.id}`}>
                            <h2>{tool.name}</h2>
                            <img src={tool.image} alt={tool.name} />
                        </Link>
                    </div>
                ))}
            </div>
        </div>
    );
};

export default Tools;