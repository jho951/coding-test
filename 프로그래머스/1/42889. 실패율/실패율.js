function solution(N, stages) {
    var answer = [];
    var user = stages.length;
    var stageArray = new Array(N).fill(0);
    var failure = [];

    // 각 스테이지 실패자 수 계산
    for (let i = 0; i < stages.length; i++) {
        if (stages[i] > N) continue;
        stageArray[stages[i] - 1]++;
    }

    // 실패율 계산
    for (let j = 0; j < stageArray.length; j++) {
        let failCount = stageArray[j];
        let rate = user === 0 ? 0 : failCount / user;
        failure.push({ stage: j + 1, rate: rate });
        user -= failCount;
    }

    // 실패율 기준 내림차순 정렬 (동률이면 stage 번호 오름차순)
    failure.sort((a, b) => {
        if (b.rate !== a.rate) return b.rate - a.rate;
        return a.stage - b.stage;
    });

    // 정렬된 stage 번호만 추출
    answer = failure.map(obj => obj.stage);

    return answer;
}
