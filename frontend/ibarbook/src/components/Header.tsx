import React from 'react';
import { Link } from 'react-router-dom';
import './Header.css'; // Создайте этот файл для стилей компонента

const Header: React.FC = () => {
    return (
        <header className="header">
            <div className="logo">iBarBook</div>
            <nav className="nav">
                <Link to="/cocktails">Коктейли</Link>
                <Link to="/ingredients">Ингредиенты</Link>
                <Link to="/tools">Штучки</Link>
            </nav>
            <button className="login-btn">Войти</button>
        </header>
    );
};

export default Header;