package br.com.fiap.lanhouse.model;

public class Computador {
   private String processador;
   private int id;
   private String placadevideo;
   private double armazenamento;
   private boolean ssd;
   private int memoriaram;

   public Computador(){


   }

   public Computador(String processador, int id, String placadevideo, double armazenamento , boolean ssd,
   int memoriaram ){
      this(processador, id);
      this.placadevideo = placadevideo;
      this.armazenamento = armazenamento;
      this.ssd = ssd;
      this.memoriaram = memoriaram;
   }
   public Computador(String processador,int id){
      this.processador = processador;
      this.id = id;
   }
   public String getProcessador() {
      return processador;
   }

   public void setProcessador(String processador) {
      this.processador = processador;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getPlacadevideo() {
      return placadevideo;
   }

   public void setPlacadevideo(String placadevideo) {
      this.placadevideo = placadevideo;
   }

   public double getArmazenamento() {
      return armazenamento;
   }

   public void setArmazenamento(double armazenamento) {
      this.armazenamento = armazenamento;
   }

   public boolean isSsd() {
      return ssd;
   }

   public void setSsd(boolean ssd) {
      this.ssd = ssd;
   }

   public int getMemoriaram() {
      return memoriaram;
   }

   public void setMemoriaram(int memoriaram) {
      this.memoriaram = memoriaram;
   }
}
