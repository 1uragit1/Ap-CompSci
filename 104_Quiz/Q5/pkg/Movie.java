package pkg;

public class Movie{
    
    String movieName;
    double rating;
    int numRating;
    int revenue;
    
    
    public Movie(){
        movieName="Avengers";
        rating=8.0;
        numRating=33;
        revenue=623357910;
    }
    public Movie(String movieName, double rating, int numRating, int revenue){
        this.movieName=movieName;
        this.rating=rating;
        this.numRating=numRating;
        this.revenue=revenue;
    }
    
    public void movieToString(){
        System.out.println("Movie: "+movieName);
        System.out.println("Rating "+rating);
        System.out.println("Number of Ratings: "+numRating);
        System.out.println("Revenue: "+revenue);
        System.out.println();
    }
    
    public String getMovieName(){
        return movieName;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public void addRating(double newrat){
        rating=((numRating*(rating))+newrat)/(numRating+1);
        numRating=numRating+1;
    }
    
    public double getRating(){
        return rating;
    }
    
    
    public boolean compareRatings(Movie movie){
        if(rating>movie.getRating()){
            return true;
        }
        else{
            return false;
        }
    }
    
    // public String revenueToString(){
    //     int r=revenue;
    //     int i=1;
    //     int c=0;
    //     String reven=new String("hi");
        
    //     while(r>0){
    //         r=r/i;
    //         c++;
    //     }
        
    //     r=revenue;
        
    //     int places=math.pow(10,c);
        
    //     while(r>0){
    //         r=r/((places)-1000);
    //         System.out.println(r+",");
    //         reven=reven+",";
    //         places=places-10;

    //     }
    //     return reven;
    // }
    
    
    
}
