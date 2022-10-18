package category;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import org.w3c.dom.Text;

import java.util.List;

import food.foodAdapter;

public class categoryAdapter extends RecyclerView.Adapter<categoryAdapter.categoryViewHolder>{
    private Context mContext;
    private List<Category> mListCategory;

    public categoryAdapter(Context mContext){
        this.mContext = mContext;

    }
    public void setData(List<Category> list){
        this.mListCategory= list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public categoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category,parent,false);

        return new categoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull categoryViewHolder holder, int position) {
    Category category = mListCategory.get(position);
    if(category == null){
        return;
    }
    holder.txt_name_category.setText(category.getNameCategory());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext,RecyclerView.HORIZONTAL,false);
        holder.rcv_food.setLayoutManager(linearLayoutManager);

    foodAdapter foodadapter = new foodAdapter();
    foodadapter.setData(category.getFoods());
    holder.rcv_food.setAdapter(foodadapter);


    }

    @Override
    public int getItemCount() {

        if (mListCategory != null){
            return mListCategory.size();
        }
        return 0;
    }

    public class categoryViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_name_category;
        private RecyclerView rcv_food;

        public categoryViewHolder(@NonNull View itemView) {

            super(itemView);
            txt_name_category = itemView.findViewById(R.id.txt_name_category);
            rcv_food = itemView.findViewById(R.id.rcv_food);
        }
    }
}
