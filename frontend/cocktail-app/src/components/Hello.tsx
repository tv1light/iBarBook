// src/components/Hello.tsx
import React from 'react';

interface HelloProps {
    name: string;
}

const Hello: React.FC<HelloProps> = ({ name }) => {
    return <h2>Hello, {name}!</h2>;
};

export default Hello;

