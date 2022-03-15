class Main {
  public static void main(String[] args) {
    System.out.println("Liczby nieparzyste");
    int i;
    for (i=0 ; i<51 ;i++)
      {
        if (i % 2==1)
          System.out.print(i + ", ");
      }
  }
}