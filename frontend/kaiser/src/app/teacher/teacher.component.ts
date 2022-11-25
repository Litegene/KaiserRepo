import { Component, OnInit } from '@angular/core';
import { TeacherService } from '../service/teacher.service';

export interface TeacherNames {
  name: String;
  surname: String;
}


@Component({
  selector: 'app-teacher',
  templateUrl: './teacher.component.html',
  styleUrls: ['./teacher.component.css']
})
export class TeacherComponent implements OnInit {

  constructor(private teacherService: TeacherService) { }

  name: string;
  surname: string;
  grade: number;
  enableTeacherInfo: boolean;

  // newTeacherName: string;
  // newTeacherSurname: string;


  ngOnInit(): void {
    this.enableTeacherInfo = true;

    this.teacherService.getTeacherList().subscribe((teacherResult: any) => {
      console.log('exampleResult', teacherResult);
      this.name = teacherResult[0].name;
      this.surname = teacherResult[0].surname;
      let grades = teacherResult[0].grades;
      this.grade = grades.gradenumber;
    })
    
  }

  switchTeacherInfo() {
    if(this.enableTeacherInfo){
      this.enableTeacherInfo = false;
    } else {
      this.enableTeacherInfo = true;
    }
  }

  // saveTeacher() {
  //   console.log(this.newTeacherName, this.newTeacherSurname);
  //   let teachernames: TeacherNames;
  //   // teachernames.name = this.newTeacherName;
  //   // teachernames.surname = this.newTeacherSurname;
  //   // this.teacherService.addTeacher()
  // }

}
