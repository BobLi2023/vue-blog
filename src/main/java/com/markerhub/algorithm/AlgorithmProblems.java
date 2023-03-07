package com.markerhub.algorithm;

import java.math.BigDecimal;
import java.util.*;

public class AlgorithmProblems {
    public static void main(String[] args) {

//        System.out.println(FiveKeyKeyboard(new int[] {1,1,5,1,5,2,4,4}));

//        System.out.println(doubleKeepTwoDecimalPlace( 15.226419));

//        System.out.println(SumOfContinuousSubIntervals());

//        int[] inputNumbers = InsertSorting(new int[] {1,3,3,3,2,4,4,4,5});
//        for (int inputNumber : inputNumbers) {
//            System.out.println(inputNumber);
//        }

//        int[] inputNumbers = DeduplicatedSort(new int[] {1,3,3,3,2,4,4,4,5});
//        for (int inputNumber : inputNumbers) {
//            System.out.println(inputNumber);
//        }

//        new int[]{7,5,9,4,2,6,8,3,5,4,3,9}
//        new int[]{1,2,3,7,1,5,9,3,2,1}
//        System.out.println(findTheEndPoint(new int[]{7,5,9,4,2,6,8,3,5,4,3,9}));

//        String[] result = oMLogsSort();
//        for (String string : result) {
//            System.out.println(string);
//        }

//        ArrayList<Integer> result = minNumber(new int[]{21,30,62,5,31});
//        for (Integer integer : result) {
//            System.out.print(integer+" ");
//        }

//        int[] result = findGoodFriend();
//        for (int i : result) {
//            System.out.print(i+" ");
//        }

//        System.out.println(taxiFare(100));

//        System.out.println(minNumberOfChanges(new int[]{1,5,3,1,4,6,0}, 2));

//        int[] results = solveContinuousSequences();
//        for (int result : results) {
//            System.out.println(result+" ");
//        }

//        System.out.println(employeeWorkNumberIssues(2600, 1));

//        int[] results = heightAndWeightSort();
//        for (int result : results) {
//            System.out.print(result+" ");
//        }

//        System.out.println(integerPairsMinSum());

//        System.out.println(maxSpendAmount());
//        String[] resultStrings = diskCapacitySort();
//        for (String resultString : resultStrings) {
//            System.out.println(resultString);
//        }

//        System.out.println(findMaxSameContinuousLetterCount());

//        System.out.println(sortArrangement());

//        System.out.println(largestNumber(new int[]{12341,123411234}));

//        Scanner in = new Scanner(System.in);
//        int workerCount = in.nextInt();
//        int helperCount = in.nextInt();
//        int[] speedsOfWorkers = new int[workerCount];
//        for(int i=0; i<speedsOfWorkers.length;i++) {
//            speedsOfWorkers[i] = in.nextInt();
//        }
//        Arrays.sort(speedsOfWorkers);
//        int[] helperOfWorkers = new int[workerCount];
//        boolean finished = false;
//        while(helperCount>0) {
//            for(int i=speedsOfWorkers.length-1; i>=0; i--) {
//                if(helperOfWorkers[i]<4) {
//                    if(helperOfWorkers[i]==0) {
//                        helperOfWorkers[i]++;
//                        helperCount--;
//                        break;
//                    }
//                    else {
//                        for(int j=i-1; j>=0; j--) {
//                            if(helperOfWorkers[j]==0) {
//                                if(speedsOfWorkers[i]/10>=speedsOfWorkers[j]/5) {
//                                    helperOfWorkers[i]++;
//                                    helperCount--;
//                                    finished = true;
//                                    break;
//                                }
//                                else {
//                                    helperOfWorkers[j]++;
//                                    helperCount--;
//                                    finished = true;
//                                    break;
//                                }
//                            }
//                        }
//                    }
//                }
//                if(finished) {
//                    break;
//                }
//            }
//        }
//
//        int sum = 0;
//        for(int i=0;i<speedsOfWorkers.length;i++) {
//            if(helperOfWorkers[i]==0) {
//                sum+=speedsOfWorkers[i]*8/10;
//            }
//            else {
//                sum+=speedsOfWorkers[i]+speedsOfWorkers[i]*(helperOfWorkers[i]-1)/10;
//            }
//        }
//        System.out.print(sum);

//        Scanner in = new Scanner(System.in);
//        int messageCount = in.nextInt();
//        int[][] messages = new int[messageCount][2];
//        int maxId = Integer.MIN_VALUE;
//        int minId = Integer.MAX_VALUE;
//        for(int i=0;i< messages.length; i++) {
//            messages[i][0] = in.nextInt();
//            messages[i][1] = in.nextInt();
//            maxId = Math.max(Math.max(messages[i][0],messages[i][1]),maxId);
//            minId = Math.min(Math.min(messages[i][0],messages[i][1]),minId);
//        }
//        int id = in.nextInt();
//        int[][] senderAndReceipter = new int[maxId-minId+1][maxId-minId+1];
//        for(int i=0;i< messages.length; i++) {
//            senderAndReceipter[messages[i][0]-minId][messages[i][1]-minId] = senderAndReceipter[messages[i][0]-minId][messages[i][1]-minId]+1;
//        }
//        boolean isBadBoy = false;
//        int L = 0;
//        int sendCount = 0;
//        int receiptCount = 0;
//        for(int i=0;i< messages.length; i++) {
//            if(senderAndReceipter[id][i] != 0 && senderAndReceipter[i][id] == 0) {
//                L++;
//            }
//            sendCount += senderAndReceipter[id][i];
//            receiptCount += senderAndReceipter[i][id];
//            if(senderAndReceipter[id][i]-senderAndReceipter[i][id]>5) {
//                isBadBoy = true;
//            }
//        }
//        int M = sendCount-receiptCount;
//        if(L>5) {
//            isBadBoy = true;
//        }
//        if(M>10) {
//            isBadBoy = true;
//        }
//        if(isBadBoy) {
//            System.out.print("true"+" "+L+" "+M);
//        }
//        else {
//            System.out.print("fasle"+" "+L+" "+M);
//        }

    }

    /**
     * 五键键盘
     *
     * @param inputNumbers 输入数字们
     * @return int
     *
     * a 键在屏幕上输出一个字母 a; 屏幕+
     * ctrl-c 将当前选择的字母复制到剪贴板; =剪贴板
     * ctrl-x 将当前选择的字母复制到剪贴板，并清空选择的字母; =剪贴板 选
     * 择=0
     * ctrl-v 将当前剪贴板里的字母输出到屏幕; 屏幕=剪贴板
     * ctrl-a 选择当前屏幕上所有字母。 屏幕
     * 1、剪贴板初始为空，新的内容被复制到剪贴板时会覆盖原来的内容
     * 2、当屏幕上没有字母时，ctrl-a 无效
     * 3、当没有选择字母时，ctrl-c 和 ctrl-x 无效
     * 4、当有字母被选择时，a 和 ctrl-v 这两个有输出功能的键会先清空选择的字母，
     * 再进行输出
     * 给定一系列键盘输入，输出最终屏幕上字母的数量。
     * 输入为一行，为简化解析，用数字 12345 代表 a,ctrl-c,ctrl-x,ctrl-v,ctrl-a 五个键的输入，数字用空格分隔
     * 输出一个数字，为最终屏幕上字母的数量。
     * 1 1 5 1 5 2 4 4
     * 2
     *
     */
    public static int FiveKeyKeyboard(int[] inputNumbers) {
        int currentCount = 0;
        int copyCount = 0;
        boolean ctrlA = false;
        for (int i = 0; i < inputNumbers.length; i++) {

            if (inputNumbers[i] == 1) {
                //屏幕上输出一个a
                if (ctrlA) {
                    currentCount = 1;
                    ctrlA = false;
                }
                else {
                    currentCount++;
                }
            }

            if (inputNumbers[i] == 2) {
                //ctrlC
                if (ctrlA) {
                    copyCount = currentCount;
                }
            }

            if (inputNumbers[i] == 3) {
                //ctrlX
                if (ctrlA) {
                    copyCount = currentCount;
                    currentCount = 0;
                }

            }
            if (inputNumbers[i] == 4) {
                //ctrlV
                if (ctrlA) {
                    currentCount = copyCount;
                    ctrlA = false;
                } else {
                    currentCount += copyCount;
                }

            }

            if (inputNumbers[i] == 5) {
                // ctrlA
                ctrlA = true;
            }

        }
        return currentCount;
    }

    /**
     * double类型保留到小数点后两位（四舍五入）
     *
     * @param inputDouble 输入的double
     * @return double
     */
    public static double doubleKeepTwoDecimalPlace(double inputDouble) {
//        double one = 5.26519;
        double one = inputDouble;
        BigDecimal two = new BigDecimal(one);
        double three = two.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        return three;
    }

    /**
     * 连续子区间和
     *
     * @return int
     *
     * 一串含有 c 个正整数的数组，求出有多少个下标的连续区间，它们的和大于等于
     * x
     * 第一行两个整数 c x
     * 第二行有 c 个正整数
     * 输出一个整数，表示所求的个数
     * 3 6
     * 2 4 7
     * 输出：4
     * 对于有 3 个整数构成的数组而言，总共有 6 个下标连续的区间，他们的和分别
     * 为：
     * 2 = 2
     * 4 = 4
     * 7 = 7
     * 2 + 4 = 6
     * 4 + 7 = 11
     * 2 + 4 + 7 = 13
     * 其中有 4 个和大于等于 6，所以答案等于 4
     *
     */
    public static int SumOfContinuousSubIntervals() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNextInt()) {
            int[] numbers = new int[sc.nextInt()];
            int targetNumber = sc.nextInt();
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextInt();
            }
            LinkedList<Integer> sums = new LinkedList<>();
            LinkedList<Integer> finalNumberIndex = new LinkedList<>();
            for (int i = 0; i < numbers.length; i++) {
                sums.offerLast(numbers[i]);
                finalNumberIndex.offerLast(i);
            }
            while (!sums.isEmpty()) {
                int size = sums.size();
                for (int i = 0; i < size; i++) {
                    int sum = sums.pollFirst();
                    int currentIndex = finalNumberIndex.pollFirst();
                    if (sum >= targetNumber) {
                        count++;
                    }
                    if (currentIndex+1 < numbers.length) {
                        sums.addLast(sum+numbers[currentIndex+1]);
                        finalNumberIndex.addLast(currentIndex+1);
                    }
                }
            }
            return count;
        }
        return count;
    }

    /**
     * 插入排序
     *
     * @param inputNumbers 输入数字
     * @return {@link int[]}
     */
    public static int[] InsertSorting(int[] inputNumbers) {
        for (int i = 0; i < inputNumbers.length; i++) {
            int temp = inputNumbers[i];
            for (int j = i-1; j >= -1; j--) {
                if (j == -1 || temp >= inputNumbers[j]) {
                    inputNumbers[j+1] = temp;
                    break;
                }
                else if (temp < inputNumbers[j]) {
                    inputNumbers[j+1] = inputNumbers[j];
                }
            }
        }
        return inputNumbers;
    }

    /**
     * 去重排序
     *
     * @param inputNumbers 输入数字们
     * @return {@link int[]}
     *
     * 给定一个乱序的数组，删除所有的重复元素，使得每个元素只出现一次，并且按
     * 照出现的次数从高到低进行排序，
     * 相同出现次数按照第一次出现顺序进行先后排序。
     * 1 3 3 3 2 4 4 4 5
     * 3 4 1 2 5
     *
     */
    public static int[] DeduplicatedSort(int[] inputNumbers) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        HashMap<Integer, Integer> orderMap = new HashMap<>();
        int order = 0;
        for (int inputNumber : inputNumbers) {
            if (orderMap.get(inputNumber) == null) {
                orderMap.put(inputNumber,order);
                order++;
            }
            if (countMap.get(inputNumber) == null) {
                countMap.put(inputNumber,1);
            }
            else {
                countMap.put(inputNumber,countMap.get(inputNumber)+1);
            }
        }
        int[] numbersOrderByCount = new int[countMap.size()];
        //接下来使用插入排序
        int index = 0;
        for (Integer integer : countMap.keySet()) {
            for (int i = index-1; i >=-1; i--) {
                if (i == -1 || countMap.get(integer) < countMap.get(numbersOrderByCount[i])) {
                    numbersOrderByCount[i+1] = integer;
                    break;
                }
                else if (countMap.get(integer) > countMap.get(numbersOrderByCount[i])) {
                    numbersOrderByCount[i+1] = numbersOrderByCount[i];
                }
                else if (countMap.get(integer) == countMap.get(numbersOrderByCount[i])) {
                    if (orderMap.get(integer) > orderMap.get(numbersOrderByCount[i])) {
                        numbersOrderByCount[i+1] = integer;
                        break;
                    }
                    else if (orderMap.get(integer) < orderMap.get(numbersOrderByCount[i])) {
                        numbersOrderByCount[i+1] = numbersOrderByCount[i];
                    }
                }
            }
            index++;
        }
        return numbersOrderByCount;
    }

    /**
     * 找终点
     *
     * @param inputNumbers 输入数字们
     * @return int
     *
     * 一个正整数数组设为 nums,最大为 100 个成员。求从第一个成员开始正好走到数
     * 组最后一个成员所使用的最小步骤数
     * 要求：1.第一步必须从第一元素起，且 1<=第一步步长<len/2 (len 为数组长
     * 度)
     * 2.从第二步开始只能以所在成员的数字走相应的步数，不能多不能少，如果目标
     * 不可达返回-1，只输出最小的步骤数量
     * 3.只能向数组的尾部走不能向回走
     * 输入描述：有正整数数组，空格分割
     * 输出描述 ：最小步数，不存在输出-1
     * 7 5 9 4 2 6 8 3 5 4 3 9
     * 2
     * 1 2 3 7 1 5 9 3 2 1
     * -1
     *
     */
    public static int findTheEndPoint(int[] inputNumbers) {
        if (inputNumbers == null || inputNumbers.length == 1) {
            return -1;
        }
        int count = 0;
        LinkedList<Integer> indexOfNumbers = new LinkedList<>();
        for (int i = 1; i < inputNumbers.length/2; i++) {
            indexOfNumbers.addLast(i);
        }
        count++;
        while (!indexOfNumbers.isEmpty()) {
            int size = indexOfNumbers.size();
            while (size > 0) {
                int currentIndex = indexOfNumbers.pollFirst();
                if (currentIndex == inputNumbers.length-1) {
                    return count;
                }
                else if (inputNumbers[currentIndex]+currentIndex < inputNumbers.length) {
                    indexOfNumbers.addLast(inputNumbers[currentIndex]+currentIndex);
                }
                else if (inputNumbers[currentIndex]+currentIndex > inputNumbers.length) {
                    continue;
                }
                size--;
            }
            count++;
        }
        return -1;
    }

    /**
     * 运维日志排序
     *
     * @return {@link String[]}
     *
     * 根据日志时间先后顺序对日志进行排序，日志时间格式为 H:M:S.N
     * H 表示小时(0~23)
     * M 表示分钟(0~59)
     * S 表示秒(0~59)
     * N 表示毫秒(0~999)
     * 时间可能并没有补全，也就是说，01:01:01.001 也可能表示为 1:1:1.1
     * 第一行输入一个整数 n 表示日志条数，1<=n<=100000，接下来 n 行输入 n 个时间
     * 按时间升序排序之后的时间，如果有两个时间表示的时间相同，则保持输入顺序
     * 2
     * 01:41:8.9
     * 1:1:09.211
     * 1:1:09.211
     * 01:41:8.9
     * 3
     * 23:41:08.023
     * 1:1:09.211
     * 08:01:22.0
     * 1:1:09.211
     * 08:01:22.0
     * 23:41:08.023
     *
     */
    public static String[] oMLogsSort() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String[] inputStrings = new String[length];
        HashMap<Double, String> hashMap = new HashMap<>();
        ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 0; i < inputStrings.length; i++) {
            inputStrings[i] = scanner.next();
        }
        for (String inputString : inputStrings) {
            String[] digits = inputString.split(":");
            double number = 0;
            for (String digit : digits) {
                number = number*60 + Double.parseDouble(digit);
            }
            hashMap.put(number, inputString);
            arrayList.add(number);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size()-1-i; j++) {
                if (arrayList.get(j) > arrayList.get(j+1)) {
                    double temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j+1, temp);
                }
            }
        }
        for (int i=0; i<arrayList.size(); i++) {
            inputStrings[i] = hashMap.get(arrayList.get(i));
        }
        return inputStrings;
    }

    /**
     * 最小数字
     *
     * @param inputNumbers 输入数字们
     * @return {@link ArrayList}<{@link Integer}>
     *
     * 给定一个整型数组，请从该数组中选择 3 个元素组成最小数字并输出（如果数组
     * 长度小于 3，则选择数组中所有元素来组成最小数字）
     * 21,30,62,5,31
     * 21305
     * 5,21
     * 215
     *
     */
    public static ArrayList<Integer> minNumber(int[] inputNumbers) {
        Arrays.sort(inputNumbers);
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int inputNumber : inputNumbers) {
            arrayList.add(inputNumber);
            count++;
            if (count == 3) {
                return arrayList;
            }
        }
        return arrayList;
    }

    /**
     * 找到好朋友
     *
     * @return {@link int[]}
     *
     * N 个小朋友站成一队，第 i 个小朋友的身高为 height[i]，第 i 个小朋友可以
     * 看到第一个比自己身高更高的小朋友 j
     * 那么 j 是 i 的好朋友 (要求：j>i) 。
     * 请重新生成一个列表，对应位置的输出是每个小朋友的好朋友的位置。如果没有
     * 看到好朋友，请在该位置用 0 代替。
     * 第一行输入 N，N 表示有 N 个小朋友
     * 第二行输入 N 个小朋友的身高 height[i]，都是整数
     * 输出 N 个小朋友的好朋友的位置
     * 8
     * 123 124 125 121 119 122 126 123
     * 1 2 6 5 5 6 0 0
     * 123 的好朋友是 1 位置上的 124 ，124 的好朋友是 2 位置上的 125，125 的好朋
     * 友是 6 位置上的 126，依此类推
     *
     */
    public static int[] findGoodFriend() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] children = new int[length];
        for (int i=0; i<children.length;i++) {
            children[i] = scanner.nextInt();
        }
        for (int i=0; i<children.length;i++) {
            boolean found = false;
            for (int j=i+1; j<children.length;j++) {
                if (children[j] > children[i]) {
                    children[i] = j;
                    found = true;
                    break;
                }
            }
            if (found == false) {
                children[i] = 0;
            }
        }
        return children;
    }

    /**
     * 出租车计费
     *
     * @param inputNumber 输入数
     * @return int
     *
     * 任何数字位置遇到数字 4 就直接跳过，其余功能都正常。
     * 输入描述:只有一行，数字 N，表示里程表的读数。
     * 输出描述:一个数字，表示实际产生的费用。以回车结束。
     * 输入：17
     * 输出：15
     * 说明：17 表示计费表的表面读数。15 表示实际产生的费用其实只有 15 块钱。
     * 5 # 4
     * 17 # 15
     * 100 # 81
     *
     */
    public static int taxiFare(int inputNumber) {
        int fare = inputNumber;
        for (int i=0; i< inputNumber+1; i++) {
            if (String.valueOf(i).indexOf("4") != -1) {
                fare--;
            }
        }
        return fare;
    }

    /**
     * 最小交换次数
     *
     * @param inputNumbers 输入数字们
     * @param maxNumber    最大数量
     * @return int
     *
     * 整数数组 nums，整数 k。输出将数组中小于 k 的整数组合到一起的最小交换次数
     * 组合在一起是指满足条件的数字相邻，不要求相邻后在数组中的位置
     * 1 3 1 4 0 k=2
     * 1 解析：交换第一个 1 和 4
     * 0 0 0 1 0 k=2
     * 0 解析：已经满足条件
     * 2 3 2 k=1
     * 0 解析：不存在小于 k 的数，无需交换
     *
     */
    public static int minNumberOfChanges(int[] inputNumbers, int maxNumber) {
        int count=0;
        int maxCount = 0;
        for (int i=0; i<inputNumbers.length; i++) {
            if (inputNumbers[i]<maxNumber) {
                count++;
            }
        }
        for (int i=0; i<inputNumbers.length-count+1; i++) {
            int currentCount = 0;
            for (int j=i; j<i+count; j++) {
                if (inputNumbers[j] < maxNumber) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }
        return count-maxCount;
    }

    /**
     * 求解连续数列
     *
     * @return {@link int[]}
     *
     * 已知连续正整数数列 {K}=K1,K2,K3…Ki 的各个数相加之和为 S ， i=N
     * (0<S<100000, 0<N<100000), 求此数列 K
     * 输入包含两个参数: 1）连续正整数数列和 S 2）数列里数的个数 N
     * 如果有解输出数列 K，如果无解输出-1
     * 525 6
     * 85 86 87 88 89 90
     * 3 5
     * -1
     *
     */
    public static int[] solveContinuousSequences() {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int count = scanner.nextInt();
        int[] results = new int[count];
        if (count%2==1) {
            if (sum%count == 0) {
                int firstNumber = sum/count-count/2;
                results[0] = firstNumber;
                for (int i=1; i<results.length;i++) {
                    results[i] = results[i-1]+1;
                }
            }
            else {
                return new int[]{-1};
            }
        }
        else {
            if (Double.parseDouble(String.valueOf(sum))/count-0.5 == sum/count) {
                int firstNumber = sum/count-count/2+1;
                results[0] = firstNumber;
                for (int i=1; i<results.length;i++) {
                    results[i] = results[i-1]+1;
                }
            }
            else {
                return new int[]{-1};
            }
        }
        return results;
    }

    /**
     * 员工工号问题
     *
     * @param peopleCount 人数
     * @param letter      字母
     * @return int
     *
     * 工号系统由小写英文字母（a-z）和数字（0-9）两部分构成。新工号由一段英文
     * 字母开头，之后跟随一段数字，比如"aaahw0001",“a12345”,“abcd1”,“a00”
     * 注意新工号不能全为字母或者数字,允许数字部分有前导 0 或者全为 0。
     * 但是过长的工号会增加同事们的记忆成本，现在给出新工号至少需要分配的人数
     * X 和新工号中字母的长度 Y
     * 求新工号中数字的最短长度 Z。
     * 一行两个非负整数 X Y，数字用单个空格分隔
     * 输出新工号中数字的最短长度 Z
     * 260 1 # 1
     * 26 1 # 1
     * 2600 1 # 2
     *
     */
    public static int employeeWorkNumberIssues(int peopleCount, int letter) {
        int number = 0;
        while (peopleCount>Math.pow(26,letter)*Math.pow(10,number)) {
            number++;
        }
        if (number == 0) {
            return 1;
        }
        else {
            return number;
        }
    }

    /**
     * 身高和体重排序
     *
     * @return {@link int[]}
     *
     * 按照身高由低到高排列，对身高相同的人，按体重由轻到重排列；对于身高体重
     * 都相同的人，维持原有的编号顺序关系。
     * 请输出排列后的学生编号。
     * 第一个序列中的数值代表身高，第二个序列中的数值代表体重。
     * 输出描述:排列结果，每个数值都是原始序列中的学生编号，编号从 1 开始
     * 4
     * 100 100 120 130
     * 40 30 60 50
     * 输出：2134
     * 3
     * 90 110 90
     * 45 60 45
     * 输出：132
     *
     */
    public static int[] heightAndWeightSort() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] positions = new int[length];
        int[] heights = new int[length];
        int[] weights = new int[length];
        for (int i=0; i<length; i++) {
            positions[i]=i+1;
            heights[i] = scanner.nextInt();
        }
        for (int i=0; i<length; i++) {
            weights[i] = scanner.nextInt();
        }
        for (int i=0; i<length; i++) {
            int tempPosition = positions[i];
            int tempHeight = heights[i];
            int tempWeight = weights[i];
            for (int j=i-1; j>=-1; j--) {
                if (j==-1 || tempHeight>heights[j]) {
                    positions[j+1]=tempPosition;
                    heights[j+1]=tempHeight;
                    weights[j+1]=tempWeight;
                    break;
                }
                else if (tempHeight<heights[j]) {
                    positions[j+1]=positions[j];
                    heights[j+1]=heights[j];
                    weights[j+1]=weights[j];
                }
                else if (tempHeight==heights[j]) {
                    if (tempWeight>=weights[j]) {
                        positions[j+1]=tempPosition;
                        heights[j+1]=tempHeight;
                        weights[j+1]=tempWeight;
                        break;
                    }
                    else if (tempWeight<weights[j]) {
                        positions[j+1]=positions[j];
                        heights[j+1]=heights[j];
                        weights[j+1]=weights[j];
                    }
                }
            }
        }
        return positions;
    }

    /**
     * 整数对最小和
     *
     * @return int
     *
     * 给定两个整数数组 array1、array2，数组元素按升序排列
     * 假设从 array1、array2 中分别取出一个元素可构成一对元素，现在需要取出 k
     * 对元素
     * 并对取出的所有元素求和，计算和的最小值
     * 3 1 1 2
     * 3 1 2 3
     * 2
     * 输出 4
     *
     */
    public static int integerPairsMinSum() {
        Scanner scanner = new Scanner(System.in);
        int length1 = scanner.nextInt();
        int[] arrays1 = new int[length1];
        for (int i=0; i<arrays1.length;i++) {
            arrays1[i]=scanner.nextInt();
        }
        int length2 = scanner.nextInt();
        int[] arrays2 = new int[length2];
        for (int i=0; i<arrays1.length;i++) {
            arrays2[i]=scanner.nextInt();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : arrays1) {
            for (int j : arrays2) {
                arrayList.add(i+j);
            }
        }
        arrayList.sort(Comparator.naturalOrder());
        int count = scanner.nextInt();
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
            count--;
            if (count==0) {
                break;
            }
        }
        return sum;
    }

    /**
     * 最大消费金额
     *
     * @return int
     *
     * 从众多心仪商品中购买 3 件，而且想尽可能的花完资金，现在请你设计一个程
     * 序，计算小明尽可能花费的最大资金数
     * 输入第一行为一维整型数组 m，数组元素记录单个商品的价格
     * 输入第二行为购买资金的额度 r
     * 输出为满足上述条件的最大花费额度。注意：如果不存在满足上述条件的商品请
     * 返回-1
     * 23,26,36,27
     * 78
     * 输出 76
     * 23,30,40
     * 26
     * 输出 -1
     *
     */
    public static int maxSpendAmount() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int expectMaxSpend = scanner.nextInt();
        String[] inputArrays = inputString.split(",");
        int[] inputNumbers = new int[inputArrays.length];
        if (inputNumbers.length<3) {
            return -1;
        }
        boolean[] isSelected = new boolean[inputArrays.length];
        for (int i=0; i<inputNumbers.length; i++) {
            inputNumbers[i] = Integer.parseInt(inputArrays[i]);
        }
        int maxSpend = -1;
        for (int i=0; i<inputNumbers.length; i++) {
            if (isSelected[i]) {
                continue;
            }
            int currentSpend = 0;
            isSelected[i]=true;
            currentSpend += inputNumbers[i];
            for (int j=0; j<inputNumbers.length; j++) {
                if (isSelected[j]) {
                    continue;
                }
                isSelected[j]=true;
                currentSpend += inputNumbers[j];
                for (int k=0; k<inputNumbers.length; k++) {
                    if (isSelected[k]) {
                        continue;
                    }
                    isSelected[k]=true;
                    currentSpend += inputNumbers[k];
                    if (currentSpend<=expectMaxSpend && currentSpend>maxSpend) {
                        maxSpend=currentSpend;
                    }
                    isSelected[k]=false;
                    currentSpend -= inputNumbers[k];

                }
                isSelected[j]=false;
                currentSpend -= inputNumbers[j];
            }
            isSelected[i]=false;
            currentSpend -= inputNumbers[i];
        }
        return maxSpend;
    }

    /**
     * 磁盘容量排序
     *
     * @return {@link String[]}
     *
     * 磁盘的容量单位常用的有 M，G，T 这三个等级，关系为 1T = 1024G、1G = 1024M
     * 如样例所示先输入磁盘的个数，再依次输入磁盘的容量大小，然后按照从小到大
     * 的顺序对磁盘容量进行排序并输出。
     * 3
     * 1G
     * 2G
     * 1024M
     * 输出
     * 1G
     * 1024M
     * 2G
     * 3
     * 2G4M
     * 3M2G
     * 1T
     * 输出
     * 3M2G
     * 2G4M
     * 1T
     *
     */
    public static String[] diskCapacitySort() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String[] inputStrings = new String[length];
        int[] inputStringsToNumbers = new int[length];
        for (int i=0; i<inputStrings.length; i++) {
            inputStrings[i] = scanner.next();
        }
        for (int i=0; i<inputStrings.length; i++) {
            int leftPointer = 0;
            int sum = 0;
            for (int j=0; j<inputStrings[i].length(); j++) {
                if (Character.isUpperCase(inputStrings[i].charAt(j))) {
                    int cutNumber = Integer.parseInt(inputStrings[i].substring(leftPointer, j));
                    if (inputStrings[i].charAt(j)=='M') {
                        sum += cutNumber;
                    }
                    if (inputStrings[i].charAt(j)=='G') {
                        sum += cutNumber*1024;
                    }
                    if (inputStrings[i].charAt(j)=='T') {
                        sum += cutNumber*1024*1024;
                    }
                    leftPointer=j+1;
                }
            }
            inputStringsToNumbers[i] = sum;
        }
        for (int i=0; i<inputStringsToNumbers.length; i++) {
            for (int j=0; j<inputStringsToNumbers.length-1-i; j++) {
                if (inputStringsToNumbers[j]>inputStringsToNumbers[j+1]) {
                    int temp = inputStringsToNumbers[j];
                    inputStringsToNumbers[j] = inputStringsToNumbers[j+1];
                    inputStringsToNumbers[j+1] = temp;
                    String tempString = inputStrings[j];
                    inputStrings[j] = inputStrings[j+1];
                    inputStrings[j+1] = tempString;
                }
            }
        }
        return inputStrings;
    }

    /**
     * 查找字符串中相同字符连续出现的最大次数
     *
     * @return int
     *
     * 输入只有一行，包含一个长度不超过 100 的字符串
     * 输出只有一行，输出相同字符串连续出现的最大次数
     * hello
     * 2
     * word
     * 1
     * aaabbc
     * 3
     *
     */
    public static int findMaxSameContinuousLetterCount() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        if (inputString.length()==1) {
            return 1;
        }
        int maxCount = 1;
        int leftPointer = 0;
        int count = 1;
        for (int i=1; i<inputString.length(); i++) {
            if (inputString.charAt(i)==inputString.charAt(leftPointer)) {
                count++;
                if (count>maxCount) {
                    maxCount = count;
                }
            }
            else {
                leftPointer = i;
                count = 1;
            }
        }
        return maxCount;
    }

    /**
     * 二叉树的前序遍历（循环迭代）
     *
     * @param root 根
     */
    public static void preOrder(ListNode root) {
        Stack<ListNode> stack = new Stack<ListNode>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                System.out.println(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
    }

    /**
     * 二叉树的中序遍历（循环迭代）
     *
     * @param root 根
     */
    public static void midOrder(ListNode root) {
        Stack<ListNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            System.out.println(root.val);
            root = root.right;
        }
    }

    /**
     * 二叉树的后序遍历（循环迭代）
     *
     * @param root 根
     */
    public static void postOrder(ListNode root) {
        Stack<ListNode> stack = new Stack<>();
        ListNode prevAccess = null;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prevAccess) {
                System.out.println(root.val);
                prevAccess = root;
                root = null;
            }
            else {
                stack.push(root);
                root = root.right;
            }
        }
    }

    /**
     * 排列序列
     *
     * @return int
     *
     * 给定参数 n 从 1 到 n 会有 n 个整数 1，2，3，…n 这 n 个数字共有 n!种排列 按
     * 大小顺序升序列出所有排列情况
     * 并 一 一 标 记 。 当 n=3 时 ， 所 有 排 列 如 下
     * “123”,“132”,“213”,“231”,“312”,“321”
     * 给定 n 和 k 返回第 n 个排列
     * 第一行为 n
     * 第二行为 k
     * 输出排列第 k 位置的数字
     * 3
     * 3
     * 213
     *
     */
    public static int sortArrangement() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int minNumber = 0;
        int maxNumber = 0;
        for (int i=1; i<=n; i++) {
            minNumber = minNumber*10+i;
        }
        for (int i=n; i>=1; i--) {
            maxNumber = maxNumber*10+i;
        }
        int count = 0;
        for (int currentNumber=minNumber; currentNumber<=maxNumber;currentNumber++) {
            String currentString = String.valueOf(currentNumber);
            boolean inExpectNumbers = true;
            for (int i=1; i<=n; i++) {
                if (currentString.contains(String.valueOf(i))) {
                    continue;
                }
                else {
                    inExpectNumbers = false;
                }
            }
            if (inExpectNumbers) {
                count++;
                if (count == k) {
                    return currentNumber;
                }
            }
        }
        return -1;
    }

    /**
     * 最大数
     *
     * @param nums 数字们
     * @return {@link String}
     *
     * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数
     *
     */
    public static String largestNumber(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length-1-i; j++) {
                int numberA = nums[j];
                int numberB = nums[j+1];
                String numberAStr = String.valueOf(numberA);
                String numberBStr = String.valueOf(numberB);
                if(numberA==numberB) {
                    continue;
                }
                int maxLength = String.valueOf(numberA).length()+
                        String.valueOf(numberB).length();
                int index = 0;
                int requireIndexA = 0;
                int requireIndexB = 0;
                boolean finished = false;
                while(!finished) {
                    if(numberAStr.length()>maxLength||numberBStr.length()>maxLength) {
                        break;
                    }
                    if(index==numberAStr.length()) {
                        numberAStr = numberAStr +
                                String.valueOf(numberBStr.charAt(requireIndexA));
                        requireIndexA++;
                    }
                    if(index==numberBStr.length()) {
                        numberBStr = numberBStr +
                                String.valueOf(numberAStr.charAt(requireIndexB));
                        requireIndexB++;
                    }
                    if(numberAStr.charAt(index)==
                            numberBStr.charAt(index)) {
                        index++;
                        continue;
                    }
                    if(numberAStr.charAt(index)<
                            numberBStr.charAt(index)) {
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                        break;
                    }
                    if(numberAStr.charAt(index)>
                            numberBStr.charAt(index)) {
                        finished = true;
                        break;
                    }
                }
            }
        }
        String result = "";
        boolean findFirstNotZero = false;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                findFirstNotZero = true;
            }
            if(findFirstNotZero) {
                result=result+nums[i];
            }
        }
        if(result.length()==0) {
            return "0";
        }
        return result;
    }



}
class ListNode {
    int val;
    ListNode left;
    ListNode right;
    ListNode(int val, ListNode left, ListNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
