-- Seed data for manual testing of bookTicket flow
-- Uses ON CONFLICT to avoid duplicate inserts when the app restarts

INSERT INTO region (id, name, created_at, modified_at)
VALUES (1, 'Mumbai', NOW(), NOW())
ON CONFLICT (id) DO NOTHING;

INSERT INTO theatre (id, name, address, rating, region_id, created_at, modified_at)
VALUES (1, 'Galaxy Cinemas', 'Bandra West', '4.5', 1, NOW(), NOW())
ON CONFLICT (id) DO NOTHING;

INSERT INTO screen (id, name, theater_id, created_at, modified_at)
VALUES (1, 'Audi 1', 1, NOW(), NOW())
ON CONFLICT (id) DO NOTHING;

INSERT INTO seat_type (id, seat_type, created_at, modified_at)
VALUES (1, 'PREMIUM', NOW(), NOW()),
       (2, 'REGULAR', NOW(), NOW())
ON CONFLICT (id) DO NOTHING;

INSERT INTO seat (id, row_number, column_number, name, seat_type_id, screen_id, created_at, modified_at)
VALUES (1, 1, 1, 'A1', 1, 1, NOW(), NOW()),
       (2, 1, 2, 'A2', 1, 1, NOW(), NOW()),
       (3, 2, 1, 'B1', 2, 1, NOW(), NOW()),
       (4, 2, 2, 'B2', 2, 1, NOW(), NOW())
ON CONFLICT (id) DO NOTHING;

INSERT INTO movie (id, title, director, genre, rating, release_year, created_at, modified_at)
VALUES (1, 'Interstellar', 'Christopher Nolan', 'Sci-Fi', 'PG-13', '2014', NOW(), NOW())
ON CONFLICT (id) DO NOTHING;

INSERT INTO shows (id, theatre_id, screen_id, movie_id, time, language, created_at, modified_at)
VALUES (1, 1, 1, 1, '2026-03-20 18:00:00', 'ENGLISH', NOW(), NOW())
ON CONFLICT (id) DO NOTHING;

INSERT INTO show_seat_type (id, show_id, seat_id, price, created_at, modified_at)
VALUES (1, 1, 1, 350, NOW(), NOW()),
       (2, 1, 2, 250, NOW(), NOW())
ON CONFLICT (id) DO NOTHING;

INSERT INTO show_seat (id, show_id, seat_id, seat_status, created_at, modified_at)
VALUES (1, 1, 1, 'AVAILABLE', NOW(), NOW()),
       (2, 1, 2, 'AVAILABLE', NOW(), NOW()),
       (3, 1, 3, 'AVAILABLE', NOW(), NOW()),
       (4, 1, 4, 'AVAILABLE', NOW(), NOW())
ON CONFLICT (id) DO NOTHING;

INSERT INTO users (id, username, email, created_at, modified_at)
VALUES (1, 'demo-user', 'demo@bookmyshow.com', NOW(), NOW())
ON CONFLICT (id) DO NOTHING;
