CREATE TABLE Hotel(
    hotid INTEGER PRIMARY KEY,
    hotnome VARCHAR(50) NOT NULL,
    hotcidade VARCHAR(20) NOT NULL,
    hotvalordiaria NUMERIC(12,2) NOT NULL DEFAULT 0,
    hotestrela INTEGER,
    hotdisponivel BOOLEAN NOT NULL DEFAULT FALSE
)
