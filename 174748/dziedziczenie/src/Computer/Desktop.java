package Computer;

import java.util.Objects;

public class Desktop extends Computer{
    protected String caseType;

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public Desktop(String caseType) {
        this.caseType = caseType;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "caseType='" + caseType  + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Desktop desktop)) return false;
        return Objects.equals(getCaseType(), desktop.getCaseType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCaseType());
    }
}
