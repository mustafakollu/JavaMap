package mustafa_kollu;

public interface MapInterface {

    void SetSize(Dimension dim);

    void GetSize(Dimension dim); // If Dimension was instead of void, the project could be used more efficiently.

    void SetBorder(int x, int y) throws Exception;

    void ClearBorder(int x, int y) throws Exception;

    boolean IsBorder(int x, int y) throws Exception;

    void Show();
}