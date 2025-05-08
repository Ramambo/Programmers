SELECT SUM(PRICE) AS TOTAL_PRICE
FROM ITEM_INFO
WHERE RARITY = 'LEGEND';
-- WHERE PARITY IN ('LEGEND') 도 사용 가능 --
-- 효육적으로는 하나만 비교하는거니까 '=' 연산이 더 효율이 좋음.-- 