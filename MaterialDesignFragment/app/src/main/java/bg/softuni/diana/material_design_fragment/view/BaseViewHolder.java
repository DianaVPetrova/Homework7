package bg.softuni.diana.material_design_fragment.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView)
    {
        super(itemView);
    }

    public abstract void setData(T data);
}