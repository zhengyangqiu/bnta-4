# Football Matches - Tasks

Each of the questions/tasks below can be answered using a `SELECT` query. When you find a solution copy it into the code block under the question before pushing your solution to GitHub.

1) Find all the matches from 2017.

```sql
<!-- Copy solution here -->
SELECT * FROM matches WHERE season = 2017;

```

2) Find all the matches featuring Barcelona.

```sql
<!-- Copy solution here -->
SELECT * FROM matches WHERE 'Barcelona' IN (hometeam,awayteam);
SELECT * FROM matches WHERE hometeam = 'Barcelona' OR awayteam = 'Barcelona'
```

3) What are the names of the Scottish divisions included?

```sql
<!-- Copy solution here -->
SELECT name FROM divisions WHERE country = 'Scotland';

SELECT * FROM divisions where name like 'Scottish%';
```

4) Find the division code for the Bundesliga. Use that code to find out how many matches Freiburg have played in the Bundesliga since the data started being collected.

```sql
<!-- Copy solution here -->
SELECT * FROM divisions WHERE name='Bundesliga';
SELECT COUNT(*) FROM matches WHERE division_code = 'D1' AND (hometeam='Freiburg' OR awayteam ='Freiburg');

```

5) Find the unique names of the teams which include the word "City" in their name (as entered in the database)

```sql
<!-- Copy solution here -->
SELECT DISTINCT hometeam FROM matches WHERE hometeam LIKE '%City%';

```

6) How many different teams have played in matches recorded in a French division?

```sql
<!-- Copy solution here -->
SELECT code FROM divisions WHERE country = 'France';
SELECT COUNT(DISTINCT hometeam) FROM matches WHERE division_code IN ('F1', 'F2');

```

7) Have Huddersfield played Swansea in the period covered?

```sql
<!-- Copy solution here -->

SELECT * FROM matches WHERE hometeam = 'Huddersfield' AND awayteam = 'Swansea' OR (hometeam = 'SWansea' OR awayteam ='Huddersfield');
SELECT * FROM matches WHERE (hometeam = 'Huddersfield' AND awayteam = 'Swansea') OR (hometeam = 'Swansea' AND awayteam = 'Huddersfield');

```

8) How many draws were there in the Eredivisie between 2010 and 2015?

```sql
<!-- Copy solution here -->
SELECT code FROM divisions WHERE name = 'Eredivisie';
SELECT COUNT(*) FROM matches WHERE ftr = 'D' AND division_code = 'N1' AND season BETWEEN 2010 AND 2015;
SELECT COUNT(*) FROM matches WHERE division_code = 'N1' AND ftr = 'D' AND season BETWEEN 2010 AND 2015;
```

9) Select the matches played in the Premier League in order of total goals scored from highest to lowest. Where there is a tie the match with more home goals should come first.

```sql
<!-- Copy solution here -->
SELECT code FROM divisions WHERE name = 'Premier League';
SELECT*FROM matches WHERE division_code ='E0' ORDER BY (fthg+ftag) DESC,fthg DESC;
SELECT * FROM matches WHERE division_code = 'E0' ORDER BY (fthg + ftag) DESC, fthg DESC;
```

10) In which division and which season were the most goals scored?

```sql
<!-- Copy solution here -->

SELECT Division_code, season FROM matches GROUP BY division_code,sesson ORDER BY SUM (fthg)+SUM (ftag) DESC LIMIT 1;
SELECT division_code, season, SUM (fthg + ftag) FROM matches GROUP BY division_code, season ORDER BY sum DESC LIMIT 1;

SELECT name FROM divisions WHERE code = 'EC';
```

### Useful Resources

- [Filtering results](https://www.w3schools.com/sql/sql_where.asp)
- [Ordering results](https://www.w3schools.com/sql/sql_orderby.asp)
- [Grouping results](https://www.w3schools.com/sql/sql_groupby.asp)