-- ============================================================
-- Programação de Banco de Dados
-- Aula: Introdução à programação com T-SQL
-- SQL Server / SSMS
-- Tabelas utilizadas nos exemplos da apresentação
-- ============================================================

-- Se as tabelas já existirem, remova-as antes de recriá-las
IF OBJECT_ID('dbo.Funcionarios', 'U') IS NOT NULL
    DROP TABLE dbo.Funcionarios;

IF OBJECT_ID('dbo.Clientes', 'U') IS NOT NULL
    DROP TABLE dbo.Clientes;
GO

-- ============================================================
-- Tabela: Clientes
-- ============================================================
CREATE TABLE dbo.Clientes (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    limite_credito DECIMAL(10,2) NOT NULL,
    data_cadastro DATE NOT NULL
);
GO

-- ============================================================
-- Tabela: Funcionarios
-- ============================================================
CREATE TABLE dbo.Funcionarios (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cargo VARCHAR(60) NOT NULL,
    salario DECIMAL(10,2) NOT NULL,
    data_admissao DATE NOT NULL
);
GO

-- ============================================================
-- Dados de exemplo: Clientes
-- ============================================================
INSERT INTO dbo.Clientes (nome, cidade, limite_credito, data_cadastro)
VALUES
    ('Ana Souza',      'São Paulo',      5000.00, '2026-01-15'),
    ('Bruno Oliveira', 'Campinas',       3000.00, '2026-02-10'),
    ('Carla Santos',   'Valinhos',       7500.00, '2026-02-25'),
    ('Diego Almeida',  'Jundiaí',        2500.00, '2026-03-05'),
    ('Elisa Ferreira', 'São Paulo',     10000.00, '2026-03-18'),
    ('Felipe Costa',   'Campinas',       4000.00, '2026-04-02'),
    ('Gabriela Lima',  'Valinhos',       6000.00, '2026-04-12'),
    ('Henrique Rocha', 'Vinhedo',        2000.00, '2026-04-20');
GO

-- ============================================================
-- Dados de exemplo: Funcionários
-- ============================================================
INSERT INTO dbo.Funcionarios (nome, cargo, salario, data_admissao)
VALUES
    ('Marcos Pereira',  'Gerente',            7500.00, '2022-03-10'),
    ('Juliana Martins', 'Analista de Vendas', 4200.00, '2023-05-15'),
    ('Ricardo Alves',   'Vendedor',           2800.00, '2024-01-08'),
    ('Patricia Gomes',  'Analista de Vendas', 3600.00, '2023-09-20'),
    ('Lucas Ribeiro',   'Vendedor',           2500.00, '2025-02-03'),
    ('Fernanda Dias',   'Gerente',            6800.00, '2021-11-17'),
    ('Rafael Mendes',   'Vendedor',           3100.00, '2024-07-01'),
    ('Camila Barros',   'Assistente',         2200.00, '2025-06-10');
GO

-- ============================================================
-- Conferência dos dados
-- ============================================================
SELECT * FROM dbo.Clientes;
SELECT * FROM dbo.Funcionarios;
GO
