import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Schildpad {
  private String kleur;
  private boolean isZichtbaar;

  private final double RAD = Math.PI / 180.0;
  private double xEcht, yEcht;        // werkelijke x- en y van de turtle
  private double richting;            // werkelijke richting van de turtle in graden

  private static SchildpadVenster v = null;
  
  /**
   * Constructor voor een schildpad;
   * maakt een schildpad op positie (100, 100) die naar boven kijkt
   */
  public Schildpad() {
    xEcht = 100;
    yEcht = 100;
    richting = 90;
    isZichtbaar = false;
  }


  // Methoden
  
  // Voeg hier eigen methode toe:
  
  
  
  public void loopVierkant( double x ) {
      maakZichtbaar();
      draaiRechts(180);
      slaap();
      vooruit(x);
      slaap();
      draaiLinks(90);
      slaap();
      vooruit(x);
      slaap();
      draaiLinks(90);
      slaap();
      vooruit(x);
      slaap();
      draaiLinks(90);
      slaap();
      vooruit(x);
      slaap();
      draaiRechts(90);
    }
  

  
  
  
  /* Laat de schildpad een stukje x achteruit lopen
   */
  public void achteruit( double x ) {
    vooruit( -x );
  }

  /* Laat de schildpad een stukje x vooruit lopen
   */
  public void vooruit( double x ) {
    xEcht += x * Math.cos ( richting * RAD );
    yEcht -= x * Math.sin ( richting * RAD );
    teken();
  }

  /* De schildpad draait naar links over de opgegeven hoek
   */
  public void draaiLinks( int hoek ) {
    richting += hoek;
    while( richting > 360.0 )
      richting -= 360.0;
    while( richting < 0.0 )
      richting += 360.0;
    teken();
  }

  /* De schildpad draait naar rechts over de opgegeven hoek
   */
  public void draaiRechts( int hoek ) {
    draaiLinks( -hoek );
  }


  /* Levert de x-coordinaat van de positie van de schildpad
   */
  public int getX() {
    return round( xEcht );
  }
  
  /* Levert de y-coordinaat van de positie van de schildpad
   */
  public int getY() {
    return round( yEcht );
  }
  
  /* Levert de richting waarin de schildpad kijkt in graden,
   * Een paar voorbeelden:
   * 0 graden is naar rechts
   * 90 graden is naar boven
   * 180 graden is naar links
   * 270 graden is naar beneden
   */
   public int getRichting() {
    return round( richting );
  }

  public void maakZichtbaar() {
    isZichtbaar = true;
    teken();
  }

  public void maakOnzichtbaar() {
    if( isZichtbaar ) {
      if( v != null ) 
        v.verwijder( this );
    }
    isZichtbaar = false;
  }

  /* Levert de waarde van het attribuut kleur van de schildpad
   */
   public String getKleur() {
    return kleur;
  }
  
  public void reset(){
    xEcht = 100;
    yEcht = 100;
    richting = 90;
    teken();    
  }
  
  /** Verandert de kleur van de schildpad
   * Toegestane invoer: "blauw", "geel", "groen"
   * "rood" of "zwart"
   * Bij een niet geldige kleur wordt de schildpad in zwart getekend
   */
  public void setKleur( String kleur ) {
    this.kleur = kleur;
    teken();
  }

  // private methoden
  private void teken() {
    if( isZichtbaar ) {
      if( v == null )
        v = new SchildpadVenster( "Venster voor schildpadden" );
      v.teken( this );
    }
  }
  
  private int round( double x ) {
    return (int) Math.round( x );
  }
  
  /** Laat de schildpad 1 seconde 'slapen'
   */
  private void slaap() {
    try { Thread.sleep( 1000 ); }
    catch( InterruptedException e ) { }
  }
  
  
  
  ////////// Inwendige klasse ////////////
    private class SchildpadVenster {
    private final double RAD = Math.PI / 180.0;  
    private JFrame frame;
    private TekenPaneel paneel;
    private Graphics gB;
    private Image buffer;
    
    private HashSet<Schildpad> database;
    private HashMap<String,Color> kleurMap;
   
    public SchildpadVenster( String titel ) {
      frame = new JFrame( titel );
      paneel = new TekenPaneel();
      frame.setContentPane( paneel );
      paneel.setPreferredSize( new Dimension( 400, 400 ) );
      frame.pack();
      database = new HashSet<Schildpad>();
      kleurMap = new HashMap<String,Color>();
      kleurMap.put( "blauw", Color.blue   );
      kleurMap.put( "geel",  Color.yellow );
      kleurMap.put( "groen", Color.green  );
      kleurMap.put( "rood",  Color.red    );
      kleurMap.put( "zwart", Color.black  );
      maakZichtbaar( true );
    }  
    
    
    // Overige methoden
    public void maakZichtbaar( boolean zichtbaar ) {
      if( gB == null ) {
        Dimension dim = paneel.getSize();
        buffer = frame.createImage( dim.width, dim.height );
        gB = buffer.getGraphics();
      }
      frame.setVisible( zichtbaar );
    }
    
    public void teken( Schildpad s ) {
      database.add( s );
      herschilder();
    }
      
    public void verwijder( Schildpad s ) {
      database.remove( s );
      herschilder();
    }
  
    
    // Private methoden
    private void herschilder() {
      maakBufferSchoon();
      Iterator<Schildpad> iter = database.iterator();
      while( iter.hasNext() ) {
        tekenSchildpad( iter.next() );
      }
      paneel.repaint();
    }
    
    
    private void maakBufferSchoon() {
      gB.setColor( Color.white );
      Dimension dim = paneel.getSize();
      gB.fillRect( 0, 0, dim.width, dim.height );
    }
    
    private void tekenSchildpad( Schildpad sp ) {
      String kleur = sp.getKleur();
      Color color = kleurMap.get( kleur );
      if( color != null ) 
        gB.setColor( color );
      else
        gB.setColor( Color.black );

      double x = sp.getX();
      double y = sp.getY();
      double richting = sp.getRichting();
      
      // kop
      tekenCirkel( x, y, 6 );
      
      // lijf
      int dx =  -18;
      x += dx * Math.cos ( richting * RAD );
      y -= dx * Math.sin ( richting * RAD );
      tekenCirkel( x, y, 12 );
      
      // linkervoorpoot
  
      dx = 10;
      x += dx * Math.cos ( richting * RAD );
      y -= dx * Math.sin ( richting * RAD );
      richting += 90;
      dx = 10;
      x += dx * Math.cos ( richting * RAD );
      y -= dx * Math.sin ( richting * RAD );
      tekenCirkel( x, y, 4 );
  
      
      // rechtervoorpoot
      dx = -20;
      x += dx * Math.cos ( richting * RAD );
      y -= dx * Math.sin ( richting * RAD );
      tekenCirkel( x, y, 4 );
      
      // rechterachterpoot
      richting += 90;
      dx = 20;
      x += dx * Math.cos ( richting * RAD );
      y -= dx * Math.sin ( richting * RAD );
      richting += 90;
      dx = 2;
      x += dx * Math.cos ( richting * RAD );
      y -= dx * Math.sin ( richting * RAD );
      tekenCirkel( x, y, 4 );
  
      // linkerachterpoot
      dx = -24;
      x += dx * Math.cos ( richting * RAD );
      y -= dx * Math.sin ( richting * RAD );
      tekenCirkel( x, y, 4 );
    }
    
    private void tekenCirkel( double xMpt, double yMpt, int r ) {
      gB.fillOval( round( xMpt - r ), round( yMpt - r ), r+r, r+r );
    }
  
    private int round( double x ) {
      return (int) Math.round( x );
    }
     
    // Inwendige klasse
    private class TekenPaneel extends JPanel {
      public void paint( Graphics g ) {
        g.drawImage( buffer, 0, 0, null );
      }
    }
  }
}
