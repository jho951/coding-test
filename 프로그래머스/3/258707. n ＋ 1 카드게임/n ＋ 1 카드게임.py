def solution(coin, cards):
    n = len(cards)
    hand = set(cards[: n // 3])
    deck = cards[n // 3 :]
    round_count = 1

    # 라운드마다 사용할 수 있는 카드들을 저장할 집합
    passed = set()

    while deck:
        # 1. 덱에서 카드 2장을 뽑음
        passed.add(deck.pop(0))
        passed.add(deck.pop(0))

        success = False

        # 경우 1: 손패(hand)에서만 2장 (코인 0개 소모)
        for card in list(hand):
            target = (n + 1) - card
            if target in hand:
                hand.remove(card)
                hand.remove(target)
                success = True
                break

        # 경우 2: 손패 1장 + 이번 라운드에 뽑은 카드 1장 (코인 1개 소모)
        if not success and coin >= 1:
            for card in list(hand):
                target = (n + 1) - card
                if target in passed:
                    hand.remove(card)
                    passed.remove(target)
                    coin -= 1
                    success = True
                    break

        # 경우 3: 이번 라운드에 뽑은 카드 2장 (코인 2개 소모)
        if not success and coin >= 2:
            for card in list(passed):
                target = (n + 1) - card
                if target in passed:
                    passed.remove(card)
                    passed.remove(target)
                    coin -= 2
                    success = True
                    break

        # 합이 n+1이 되는 카드 쌍을 찾지 못하면 게임 종료
        if not success:
            break

        round_count += 1

    return round_count
