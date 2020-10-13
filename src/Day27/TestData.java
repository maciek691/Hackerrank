package Day27;

import static Day27.Solution.minimum_index;

    class TestDataEmptyArray {
        public static int[] get_array() {
            // complete this function
            return new int[0];
        }
    }

    class TestDataUniqueValues {
        public static int[] get_array() {
            // complete this function
            return new int[] {1,2,3,4,5};
        }

        public static int get_expected_result() {
            // complete this function
            return 0;
        }
    }

    class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            // complete this function
            return new int[] {1, 2, 3, 0, 4, 56, 0, 7, 8, 9};
        }

        public static int get_expected_result() {
            // complete this function
            return 3;
        }
    }

