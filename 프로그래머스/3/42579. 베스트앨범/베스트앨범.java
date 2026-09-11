import java.util.*;

class Solution {
    // 노래 정보를 담을 클래스 선언
    static class Music implements Comparable<Music> {
        int id;
        int play;
        String genre;

        public Music(int id, int play, String genre) {
            this.id = id;
            this.play = play;
            this.genre = genre;
        }

        @Override
        public int compareTo(Music other) {
            // 재생 횟수가 같으면 고유 번호(id)가 오름차순
            if (this.play == other.play) {
                return Integer.compare(this.id, other.id);
            }
            // 재생 횟수가 많은 것이 내림차순
            return Integer.compare(other.play, this.play);
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genrePlayMap = new HashMap<>();
        Map<String, List<Music>> genreMusicMap = new HashMap<>();

        // 1. 데이터 정리 (장르별 총 재생 횟수, 장르별 노래 목록 저장)
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            genrePlayMap.put(genre, genrePlayMap.getOrDefault(genre, 0) + play);

            genreMusicMap.putIfAbsent(genre, new ArrayList<>());
            genreMusicMap.get(genre).add(new Music(i, play, genre));
        }

        // 2. 장르별 총 재생 횟수 기준 내림차순 정렬
        List<String> sortedGenres = new ArrayList<>(genrePlayMap.keySet());
        sortedGenres.sort((g1, g2) -> Integer.compare(genrePlayMap.get(g2), genrePlayMap.get(g1)));

        List<Integer> result = new ArrayList<>();

        // 3. 각 장르별로 최대 2곡씩 선택
        for (String genre : sortedGenres) {
            List<Music> musicList = genreMusicMap.get(genre);
            Collections.sort(musicList); // Music 클래스의 정렬 기준 적용

            // 최대 2개 추가
            for (int i = 0; i < Math.min(musicList.size(), 2); i++) {
                result.add(musicList.get(i).id);
            }
        }

        // 4. 리스트를 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
