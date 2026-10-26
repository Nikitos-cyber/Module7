package org.module.essence;


import java.util.Objects;

public class Read {
    private final String read;
    private ReadStatus status;
    public Read( String read, ReadStatus status){
        this.read = read;
        this.status = status;
    }

    public String getRead(){
        return read;
    }

    public ReadStatus getStatus(){
        return status;
    }
    public void setStatus(ReadStatus status){
        this.status = status;
    }

    @Override
    public boolean equals(Object object){
        if(object == this)
            return true;
        if(object == null || getClass() != object.getClass())
            return false;

        Read obj = (Read) object;

        return Objects.equals(read, obj.read) && Objects.equals(status,obj.status);
    }

    @Override
    public int hashCode(){
        int num = 1;
        num = 31 * num + (read != null ? read.hashCode() : 0);
        num = 31 * num + (status != null ? status.hashCode() : 0);
        return num;
    }
}
