CREATE TYPE rental_status AS ENUM ('NOT_STARTED', 'RENTING', 'FINISHED');

CREATE TABLE IF NOT EXISTS rental (
                                      id UUID PRIMARY KEY,
                                      renter_id UUID NOT NULL REFERENCES "user"(id) ON DELETE CASCADE,
    asset_id UUID NOT NULL REFERENCES asset(id) ON DELETE CASCADE,
    rent_price NUMERIC NOT NULL,
    start_date TIMESTAMP,
    end_date TIMESTAMP,
    status rental_status NOT NULL DEFAULT 'NOT_STARTED',
    creation_date TIMESTAMP DEFAULT now(),
    update_date TIMESTAMP DEFAULT now()
    );