import { Component, OnInit } from '@angular/core';
import { VideoLikeService } from '../service/videoLikeService.service';
import { videoLikesDto } from '../model/VideoLikesModel';

@Component({
  selector: 'app-videolikes',
  templateUrl: './videolikes.component.html',
  styleUrls: ['./videolikes.component.css']
})
export class VideolikesComponent implements OnInit {

  constructor(private videoLikeService: VideoLikeService) { }
  videoName: string;
  videoLikeCounter: number;
  videoLikesDto: videoLikesDto[];
  enableVideoInfo: boolean;

  ngOnInit(): void {
    this.enableVideoInfo = true;

    this.videoLikesDto = [];
    this.getVideoLikesDto();
    // this.videoLikeService.getVideoList().subscribe((videoResult: any) =>{
    //   this.videoName=videoResult[this.videoLikeCounter].videoName;
    //   this.videoLikeCounter=videoResult[this.videoLikeCounter].videoLikeCounter;
    // })
  }

  getVideoLikesDto() {
    this.videoLikeService.getVideoList().subscribe((videoLikeServiceResult: any) => {
		let vid = videoLikeServiceResult;

    videoLikeServiceResult.forEach((element: { name: string; likes: number;}) => {
      let videoLikesDtoObject = {
        name: element.name,
        likes: element.likes,
      };
      this.videoLikesDto.push(videoLikesDtoObject);
    });
    
    });
  }

  switchVideoLikesInfo() {
    console.log('switch button is working')
    if(this.enableVideoInfo){
      this.enableVideoInfo = false;
    } else {
      this.enableVideoInfo = true;
    }
  }

}
