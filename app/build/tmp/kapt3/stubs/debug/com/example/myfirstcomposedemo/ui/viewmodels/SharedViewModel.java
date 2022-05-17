package com.example.myfirstcomposedemo.ui.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/myfirstcomposedemo/ui/viewmodels/SharedViewModel;", "Landroidx/lifecycle/ViewModel;", "toDoRepository", "Lcom/example/myfirstcomposedemo/data/repository/ToDoRepository;", "(Lcom/example/myfirstcomposedemo/data/repository/ToDoRepository;)V", "_allTasks", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/myfirstcomposedemo/Util/RequestState;", "", "Lcom/example/myfirstcomposedemo/data/models/ToDoTask;", "allTasks", "Lkotlinx/coroutines/flow/StateFlow;", "getAllTasks", "()Lkotlinx/coroutines/flow/StateFlow;", "searchAppBarState", "Landroidx/compose/runtime/MutableState;", "Lcom/example/myfirstcomposedemo/Util/SearchAppBarState;", "getSearchAppBarState", "()Landroidx/compose/runtime/MutableState;", "searchTextState", "", "getSearchTextState", "getAllTAsk", "", "app_debug"})
public final class SharedViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.myfirstcomposedemo.data.repository.ToDoRepository toDoRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<com.example.myfirstcomposedemo.Util.SearchAppBarState> searchAppBarState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.String> searchTextState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.myfirstcomposedemo.Util.RequestState<java.util.List<com.example.myfirstcomposedemo.data.models.ToDoTask>>> _allTasks = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.myfirstcomposedemo.Util.RequestState<java.util.List<com.example.myfirstcomposedemo.data.models.ToDoTask>>> allTasks = null;
    
    @javax.inject.Inject()
    public SharedViewModel(@org.jetbrains.annotations.NotNull()
    com.example.myfirstcomposedemo.data.repository.ToDoRepository toDoRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.example.myfirstcomposedemo.Util.SearchAppBarState> getSearchAppBarState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.String> getSearchTextState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.myfirstcomposedemo.Util.RequestState<java.util.List<com.example.myfirstcomposedemo.data.models.ToDoTask>>> getAllTasks() {
        return null;
    }
    
    public final void getAllTAsk() {
    }
}