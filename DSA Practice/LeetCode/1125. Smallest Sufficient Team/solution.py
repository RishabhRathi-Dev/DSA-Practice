class Solution:
    def smallestSufficientTeam(self, req_skills: List[str], people: List[List[str]]) -> List[int]:
        # TLE at 36/38 :(

        
        """n = len(req_skills)
        target = int("".join(["1" for _ in range(n)]), 2)
        c = ["0" for _ in range(n)]
        def toInt(skills):
            start = 0
            cc = c[::]
            for i in skills:
                cc[req_skills.index(i)] = "1"

            return int("".join(cc), 2)

        newPeople = [toInt(i) for i in people]
        ind = [i for i in range(len(people))]

        combined = sorted(list(zip(newPeople, ind)), reverse=True)

        best_team_size = float('inf')
        res = []

        def backtrack(idx, current_team, current_skills):
            nonlocal best_team_size, res

            if current_skills == target and len(current_team) < best_team_size:
                best_team_size = len(current_team)
                res = current_team[:]
                return

            if len(current_team) >= best_team_size:
                return

            if idx == len(people):
                return

            current_team.append(idx)
            backtrack(idx + 1, current_team, current_skills | newPeople[idx])
            current_team.pop()
            backtrack(idx + 1, current_team, current_skills)

        backtrack(0, [], 0)
        return res """

        n = len(people)
        m = len(req_skills)
        skill_id = dict()
        for i, skill in enumerate(req_skills):
            skill_id[skill] = i
        skills_mask_of_person = [0] * n
        for i in range(n):
            for skill in people[i]:
                skills_mask_of_person[i] |= 1 << skill_id[skill]
        dp = [-1] * (1 << m)
        dp[0] = 0

        def f(skills_mask):
            if dp[skills_mask] != -1:
                return dp[skills_mask]
            for i in range(n):
                new_skills_mask = skills_mask & ~skills_mask_of_person[i]
                if new_skills_mask != skills_mask:
                    people_mask = f(new_skills_mask) | (1 << i)
                    if (dp[skills_mask] == -1 or
                        people_mask.bit_count()
                       < dp[skills_mask].bit_count()):
                        dp[skills_mask] = people_mask
            return dp[skills_mask]
        answer_mask = f((1 << m) - 1)
        ans = []
        for i in range(n):
            if (answer_mask >> i) & 1:
                ans.append(i)
        return ans