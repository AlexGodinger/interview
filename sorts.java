public static void selectionSort(int array[]) {
        int maxIndex, temp;
        for (int i = 0; i < array.length; i++) {
            maxIndex = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
                temp = array[array.length - 1 - i];
                array[array.length - 1 - i] = array[maxIndex];
                array[maxIndex] = temp;
            }


        }
    }

    public static void bubbleSort(int arr[]) {
        int temp;
        boolean sorted = false;
        for (int i = 0; i < arr.length - 1 && !sorted; i++) {
            sorted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                    times++;
                }
            }
        }
    }