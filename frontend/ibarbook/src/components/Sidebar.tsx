import React from 'react';
import './Sidebar.css'; // Создайте этот файл для стилей компонента

const Sidebar: React.FC = () => {
    return (
        <aside className="sidebar">
            <input type="text" placeholder="Поиск..." />
        </aside>
    );
};

export default Sidebar;