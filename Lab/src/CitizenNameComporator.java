
import java.util.Comparator;

class CitizenNameComporator implements Comparator<Citizens>{
    @Override
    public int compare(Citizens o1, Citizens o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


class CitizenAgeComporator implements Comparator<Citizens>{

    @Override
    public int compare(Citizens o1, Citizens o2) {
        if(o1.getAge() > o2.getAge())
            return 1;

        else if (o1.getAge() < o2.getAge())
            return -1;
        else
            return 0;
    }
}