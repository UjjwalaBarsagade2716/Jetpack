package com.example.myfirstcomposedemo.data.repository

import com.example.myfirstcomposedemo.data.ToDoDao
import com.example.myfirstcomposedemo.data.models.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
@ViewModelScoped
class ToDoRepository @Inject constructor(private  val toDoDao: ToDoDao) {

    val getAllTask:Flow<List<ToDoTask>> =toDoDao.getAllTask()
    val sortBylowPriority:Flow<List<ToDoTask>> =toDoDao.sortByLowPriority()
    val sortByHighPriority:Flow<List<ToDoTask>> =toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId:Int):Flow<ToDoTask>{
        return  toDoDao.getSelectedTask(taskId = taskId)
    }


 suspend fun addTask(toDoTask: ToDoTask){
     toDoDao.addTask(toDoTask = toDoTask)
 }
    suspend fun updateTask(toDoTask: ToDoTask){
     toDoDao.upadteTask(toDoTask = toDoTask)
 }
    suspend fun deleteTask(toDoTask: ToDoTask){
     toDoDao.deleteTask(toDoTask = toDoTask)
 }

    suspend fun deleteAllTask() = toDoDao.deleteAllTask()

    fun searchDatabase(searchQuery:String){
        toDoDao.searchDatabase(searchQuery)
    }

}