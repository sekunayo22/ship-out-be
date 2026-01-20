INSERT INTO voyage (service_string, vessel_id)
VALUES
('LL6', 1),
('LL6', 2),
('LL3', 3),
('LL3', 4),
('LL5', 5),
('LL5', 6),
('LL6', 7),
('LL6', 8),
('LL3', 9),
('LL3', 10),
('LL5', 11),
('LL5', 12),
('LL6', 13),
('LL6', 14),
('LL3', 15),
('LL3', 16),
('LL5', 17),
('LL5', 18),
('LL6', 19),
('LL6', 20)
ON CONFLICT DO NOTHING;