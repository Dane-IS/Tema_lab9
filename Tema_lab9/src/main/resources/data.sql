CREATE TABLE IF NOT EXISTS masina (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    numar_matriculare VARCHAR(50) UNIQUE NOT NULL,
    marca VARCHAR(100) NOT NULL,
    an INT NOT NULL,
    culoarea VARCHAR(50),
    kilometrii INT NOT NULL
    );

INSERT INTO masina (numar_matriculare, marca, an, culoarea, kilometrii)
VALUES
    ('AB-123-CD', 'Dacia', 2018, 'Alb', 50000),
    ('EF-456-GH', 'Renault', 2020, 'Negru', 30000),
    ('IJ-789-KL', 'Volkswagen', 2015, 'Roșu', 120000),
    ('MN-012-OP', 'Toyota', 2021, 'Albastru', 10000),
    ('QR-345-ST', 'Ford', 2019, 'Verde', 60000);