CREATE TYPE asset_type AS ENUM ('FINANCIAL', 'PHYSICAL');

CREATE TABLE IF NOT EXISTS asset (
    "name" VARCHAR NOT NULL,
    price NUMERIC NOT NULL,
    "type" asset_type NOT NULL,
    creation_date TIMESTAMP DEFAULT now(),
    update_date TIMESTAMP DEFAULT now()
    );
