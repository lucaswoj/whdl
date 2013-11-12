package org.whdl.frontend;

class SourceLocation {

  private String filepath;
  private int startRow;
  private int startColumn;
  private int endRow;
  private int endColumn;

  SourceLocation(
    String filepath,
    int startRow,
    int startColumn,
    int endRow,
    int endColumn
  ) {
    this.filepath = filepath;
    this.startRow = startRow;
    this.startColumn = startColumn;
    this.endRow = endRow;
    this.endColumn = endColumn;
  }

  public String getFilepath() {
    return filepath;
  }

  public int getStartRow() {
    return startRow;
  }

  public int getStartColumn() {
    return startColumn;
  }

  public int getEndRow() {
    return endRow;
  }

  public int getEndColumn() {
    return endColumn;
  }

}