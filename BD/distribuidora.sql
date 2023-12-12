-- Criar a tabela 'usuario'
CREATE TABLE usuario (
    IdUsuario INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    cpf VARCHAR(14) UNIQUE,
    telefone VARCHAR(20),
    senha VARCHAR(255),
    tipo_usuario VARCHAR(50)
);

-- Criar a tabela 'produtos'
CREATE TABLE produtos (
    IdProduto INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    preco DECIMAL(10, 2),
    estoque INT
);

-- Criar a tabela 'pedidos'
CREATE TABLE pedidos (
    IdPedido INT AUTO_INCREMENT PRIMARY KEY,
    IdUsuario INT,
    IdProduto INT,
    valor DECIMAL(10, 2),
    quantidade INT,
    data DATE,
    FOREIGN KEY (IdUsuario) REFERENCES usuario(IdUsuario),
    FOREIGN KEY (IdProduto) REFERENCES produtos(IdProduto)
);

-- Inserir produtos
INSERT INTO produtos (nome, preco, estoque) VALUES
('Refri uva', 8.00, 20),
('Refri Berry', 9.50, 10),
('Refri Morango', 10.00, 8),
('Refri Laranja', 8.00, 20);

-- Inserir usuário Admin
INSERT INTO usuario (nome, tipo_usuario, senha) VALUES
('Admin', 'Administrador', '2023');

SELECT * FROM produtos;
SELECT * FROM usuario;
SELECT * FROM pedidos;