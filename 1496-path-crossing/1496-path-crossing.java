class Solution {
    public boolean isPathCrossing(String path) {

        int point = 0;

        Set<Integer> points = new HashSet<>();
        points.add(point);

        for (char ch : path.toCharArray()) {

            switch (ch) {
                case 'N' -> point++;
                case 'S' -> point--;
                case 'E' -> point += 100_000;
                default -> point -= 100_000;
            }

            if (!points.add(point)) {
                return true;
            }

        }

        return false;
    }
}