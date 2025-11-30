DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_type WHERE typname = 'asset_type') THEN
CREATE TYPE asset_type AS ENUM ('FINANCIAL', 'PHYSICAL');
END IF;
END$$;


CREATE TABLE IF NOT EXISTS asset (
                                     id UUID PRIMARY KEY,
                                     owner_id UUID NOT NULL REFERENCES "user"(id) ON DELETE CASCADE,
    "name" VARCHAR NOT NULL,
    price NUMERIC NOT NULL,
    "type" asset_type NOT NULL,
    creation_date TIMESTAMP DEFAULT now(),
    update_date TIMESTAMP DEFAULT now()
    );
