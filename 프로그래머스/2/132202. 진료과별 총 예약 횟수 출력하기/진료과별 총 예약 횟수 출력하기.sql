SELECT MCDP_CD AS '진료과 코드', COUNT(APNT_YMD) AS '5월예약건수'
FROM APPOINTMENT
WHERE YEAR(APNT_YMD) = 2022 AND MONTH(APNT_YMD) = 5
GROUP BY MCDP_CD
ORDER BY `5월예약건수` ASC, `진료과 코드` ASC;