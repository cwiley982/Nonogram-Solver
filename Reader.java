class Reader {

    public static Nonogram readFile(String filename) {
        Scanner in = new Scanner(new File(filename));
        int rows = Integer.parseInt(in.readLine());
        int cols = Integer.parseInt(in.readLine());
        Nonogram n = new Nonogram(rows, cols);
        String rowInfo = in.readLine();
        String[] rowInfoArray = rowInfo.split(",");
        for (int i = 0; i < rows; i++) {
            // row index, info for that row
            n.setRowInfo(i, rowInfoArray[i]);
        }
        String colInfo = in.readLine();
        String[] colInfoArray = colInfo.split(",");
        for (int i = 0; i < cols; i++) {
            // col index, info for that col
            n.setColInfo(i, colInfoArray[i]);
        }
        return n;
    }
}

class Nonogram {
    int rows;
    int cols;
    String[] rowInfo;
    String[] colInfo;

    Nonogram(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        rowInfo = new String[rows];
        colInfo = new String[cols];
    }

    void setRowInfo(int index, String info) {
        rowInfo[index] = info;
    }

    void setColInfo(int index, String info) {
        colInfo[index] = info;
    }
}