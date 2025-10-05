-- 자식(업그레이드 대상)이 없는 아이템 = 리프(leaf) 노드
SELECT
    i.ITEM_ID,
    i.ITEM_NAME,
    i.RARITY
FROM ITEM_INFO AS i
JOIN ITEM_TREE AS t
  ON t.ITEM_ID = i.ITEM_ID
WHERE NOT EXISTS (
    SELECT 1
    FROM ITEM_TREE AS c
    WHERE c.PARENT_ITEM_ID = t.ITEM_ID   -- t.ITEM_ID를 부모로 두는 자식이 있으면 제외
)
ORDER BY i.ITEM_ID DESC;
