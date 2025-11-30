CREATE TYPE user_type AS ENUM ('PERSON', 'COMPANY', 'ORGANIZATION')

CREATE TABLE IF NOT EXISTS "user" (
                                      id UUID PRIMARY KEY,
                                      "name" VARCHAR NOT NULL,
                                      email VARCHAR UNIQUE NOT NULL,
                                      address VARCHAR,
                                      work_field VARCHAR,
                                      "type" user_type,
                                      creation_date TIMESTAMP DEFAULT now(),
    update_date TIMESTAMP DEFAULT now()
    );