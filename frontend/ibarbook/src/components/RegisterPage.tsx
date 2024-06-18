import React from 'react';
import './RegisterPage.css';

const RegisterPage: React.FC = () => {
    return (
        <div className="register-page">
            <div className="register-container">
                <div className="logo">iBarBook</div>
                <div className="description">
                    Зарегистрируйтесь, для того чтобы получить дополнительные возможности
                </div>
                    <input type="text" placeholder="Username" className="input-field" />
                    <input type="email" placeholder="E-mail" className="input-field" />
                    <input type="password" placeholder="Password" className="input-field" />
                    <button type="submit" className="register-button">Зарегистрироваться</button>
                <div className="agreement">
                    Регистрируясь, вы соглашаетесь с <a href="/terms">пользовательским соглашением</a>
                </div>
            </div>
        </div>
    );
};

export default RegisterPage;
