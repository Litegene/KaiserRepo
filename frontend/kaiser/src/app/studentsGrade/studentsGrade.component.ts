import { Component, OnDestroy, OnInit } from '@angular/core';
import { takeUntil } from 'rxjs';
import { StudentsGradeService } from '../service/studentsGrade.service';
import { StudentGradeDto } from '../model/studentGradeModel';


@Component({
  selector: 'app-studentsGrade',
  templateUrl: './studentsGrade.component.html',
  styleUrls: ['./studentsGrade.component.css']
})
export class StudentsGradeComponent implements OnInit {
  studentsGradeDto: StudentGradeDto[];
  
  constructor(private studentsGradeService: StudentsGradeService) { }
  
  ngOnInit(): void {
      this.studentsGradeDto = [];
      this.getStudentsGradeDto();
  }

  getStudentsGradeDto() {
    this.studentsGradeService.getStudentsDtoList().subscribe((studentsGradeServiceResult: any) => {
		let stud = studentsGradeServiceResult;

    studentsGradeServiceResult.forEach((element: { email: string; name: string; gradeId: number; homeGradeTeacherId: number; }) => {
      let studentGradeDtoObject = {
        email: element.email,
        name: element.name,
        gradeId: element.gradeId,
        homeGradeTeacherId: element.homeGradeTeacherId,
      };
      this.studentsGradeDto.push(studentGradeDtoObject);
    });
    
    });
  }

}
