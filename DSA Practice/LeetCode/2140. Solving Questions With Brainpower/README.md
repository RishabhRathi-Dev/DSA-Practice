# 2140. Solving Questions With Brainpower

You are given a 0-indexed 2D integer array questions where questions[i] = [pointsi, brainpoweri].

The array describes the questions of an exam, where you have to process the questions in order (i.e., starting from question 0) and make a decision whether to solve or skip each question. Solving question i will earn you pointsi points but you will be unable to solve each of the next brainpoweri questions. If you skip question i, you get to make the decision on the next question.

For example, given questions = [[3, 2], [4, 3], [4, 4], [2, 5]]:

- If question 0 is solved, you will earn 3 points but you will be unable to solve questions 1 and 2.

- If instead, question 0 is skipped and question 1 is solved, you will earn 4 points but you will be unable to solve questions 2 and 3.

Return the maximum points you can earn for the exam.

[Link](https://leetcode.com/problems/solving-questions-with-brainpower/)

## Approach

Dynamic Programming - Bottom up Approach

Now in this we go from back instead of going from front. Our objective is to get the maximum for last and work our way up to the first 1 to get the max one.

Dry Run

    arr = [[1,1],[2,2],[3,3],[4,4],[5,5]]

    dp = [0, 0, 0, 0, 0, 0] |Why one extra? Well we need to have an index for last one to process with. Don't want any index out of range error

    nextQuestion = min(n, i+jump+1)
    dp[i] = max(dp[i+1], point + dp[nextQuestion])

    step 1: n - 1 = 4, max = (0, 5+0)
    dp = [0, 0, 0, 0, 5, 0]

    step 2: 3 , max = (5, 4+0)
    dp = [0, 0, 0, 5, 5, 0]

    step 3: 2, max = (5, 3 + 0)
    dp = [0, 0, 5, 5, 5, 0]

    step 4: 1, max = (5, 2 + 5)
    dp = [0, 7, 5, 5, 5, 0]

    step 5: 0, max = (7, 1 + 5)
    dp = [7, 7, 5, 5, 5, 0]

    dp[0] is answer

    here it is 7