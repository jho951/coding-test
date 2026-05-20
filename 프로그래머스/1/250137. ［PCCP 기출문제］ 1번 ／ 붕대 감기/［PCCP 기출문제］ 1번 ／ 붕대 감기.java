class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health; // 최대 체력 보존
        int lastAttackTime = attacks[attacks.length - 1][0]; // 마지막 공격 시간
        
        int attackIdx = 0;   // 몬스터 공격 배열을 탐색할 인덱스
        int continuousTime = 0; // 붕대 감기 연속 성공 시간
        
        // 0초부터 마지막 공격 시간까지 흐름 시뮬레이션
        for (int i = 0; i <= lastAttackTime; i++) {
            
            // 몬스터의 공격 타이밍인 경우
            if (attacks[attackIdx][0] == i) {
                health -= attacks[attackIdx][1]; // 피해량만큼 체력 감소
                continuousTime = 0; // 연속 성공 시간 초기화
                attackIdx++; // 다음 공격 준비
                
                // 캐릭터가 사망한 경우 즉시 -1 반환
                if (health <= 0) {
                    return -1;
                }
            } 
            // 공격이 없는 안전한 타이밍인 경우 (0초일 때는 회복하지 않음)
            else if (i > 0) {
                continuousTime++; // 연속 성공 시간 증가
                health += bandage[1]; // 초당 회복량 추가
                
                // 연속 성공 시간을 모두 채웠을 때 추가 회복
                if (continuousTime == bandage[0]) {
                    health += bandage[2]; // 추가 회복량 추가
                    continuousTime = 0; // 연속 성공 시간 초기화
                }
                
                // 최대 체력을 초과할 수 없음
                if (health > maxHealth) {
                    health = maxHealth;
                }
            }
        }
        
        return health;
    }
}
