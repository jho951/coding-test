class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (String skillTree : skill_trees) {
            // 유저의 스킬트리에서 선행 스킬(skill)에 포함되지 않은 문자들을 모두 제거
            // [^...]은 ...에 포함되지 않은 문자를 의미합니다.
            String filteredSkill = skillTree.replaceAll("[^" + skill + "]", "");
            
            // 추출된 문자열이 선행 스킬 순서의 처음부터 시작하는지 확인
            // 예: skill이 "CBD"일 때, "" / "C" / "CB" / "CBD" 모두 올바른 순서입니다.
            if (skill.indexOf(filteredSkill) == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
